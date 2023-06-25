import {
  AfterViewInit,
  ChangeDetectorRef,
  Component,
  ElementRef,
  OnDestroy,
  OnInit,
  ViewChild,
} from '@angular/core';
import { NgForm } from '@angular/forms';
import { AngularStripeService } from '@fireflysemantics/angular-stripe-service';

@Component({
  selector: 'app-paiement-area',
  templateUrl: './paiement-area.component.html',
  styleUrls: ['./paiement-area.component.css'],
})
export class PaiementAreaComponent implements AfterViewInit, OnDestroy {
  @ViewChild('cardInfo', { static: false }) cardInfo: ElementRef;

  stripe;
  loading = false;
  confirmation;

  card: any;
  cardHandler = this.onChange.bind(this);
  error: string;

  constructor(
    private cd: ChangeDetectorRef,
    private stripeService: AngularStripeService
  ) {}

  ngAfterViewInit() {
    this.stripeService
      .setPublishableKey('pk_test_6TsolligKi7hh16IIm9IzQTA00b3uarDOL')
      .then((stripe) => {
        this.stripe = stripe;
        const elements = stripe.elements();
        this.card = elements.create('card');
        this.card.mount(this.cardInfo.nativeElement);
        this.card.addEventListener('change', this.cardHandler);
      });
  }

  ngOnDestroy() {
    this.card.removeEventListener('change', this.cardHandler);
    this.card.destroy();
  }

  onChange({ error }) {
    if (error) {
      this.error = error.message;
    } else {
      this.error = null;
    }
    this.cd.detectChanges();
  }

  async onSubmit(form: NgForm) {
    const { token, error } = await this.stripe.createToken(this.card);

    if (error) {
      console.log('Error:', error);
    } else {
      console.log('Success!', token);
    }
  }
}
