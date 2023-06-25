package ma.cigma.funtravels.services;

import ma.cigma.funtravels.models.Image;

public interface ImageService {

	Image save(Image i);

	Image findImage(Long id);

	Iterable<Image> findAll();

	void deleteImage(Long id);
}
