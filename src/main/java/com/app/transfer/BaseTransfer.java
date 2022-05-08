package com.app.transfer;

public interface BaseTransfer<E, D> {

    E toEntity(D d);
    D toDto(E e);

}
