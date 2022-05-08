package com.app.transfer;

import com.app.dto.ImageDto;
import com.app.entity.Image;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ImageTransfer implements BaseTransfer<Image, ImageDto> {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Image toEntity(ImageDto imageDto) {
        return null;
    }

    @Override
    public ImageDto toDto(Image image) {

        if (image == null)
            return null;

        ImageDto imageDto = modelMapper.map(image, ImageDto.class);
        if (image.getProduct() != null) {
            imageDto.setProductId(image.getProduct().getId());
        }
        return imageDto;
    }

}
