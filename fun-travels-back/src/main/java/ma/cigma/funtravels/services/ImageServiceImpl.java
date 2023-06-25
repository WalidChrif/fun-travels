package ma.cigma.funtravels.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.cigma.funtravels.exceptions.ImageException;
import ma.cigma.funtravels.models.Image;
import ma.cigma.funtravels.repositories.ImageRepository;

@Service
@Transactional
public class ImageServiceImpl implements ImageService {

	@Autowired
	private ImageRepository imageRepository;

	@Override
	public Image save(Image i) {
		try {
			return imageRepository.save(i);
		} catch (Exception ex) {
			throw new ImageException("Erreur de faire l'operation! l'image n'a pas enregistrer");
		}
	}

	@Override
	public Image findImage(Long id) {
		Image image = imageRepository.findById(id).get();

		if (image == null) {
			throw new ImageException("L'image avec id '"+id+"' n'existe pas!");
		}

		return image;
	}

	@Override
	public Iterable<Image> findAll() {

		return imageRepository.findAll();
	}

	@Override
	public void deleteImage(Long id) {

		Image image = imageRepository.findById(id).get();

		if (image == null) {
			throw new ImageException("Erreur de faire l'operation car l'image avec id '"+id+"' n'existe pas!");
		}

		imageRepository.delete(image);

	}

}
