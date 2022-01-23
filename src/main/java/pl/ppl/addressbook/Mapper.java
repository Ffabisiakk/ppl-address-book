package pl.ppl.addressbook;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Mapper<E, D> {

    public abstract D toDto(E e);

    public List<D> toDtoList(List<E> list) {
        return list.stream().map(this::toDto).collect(Collectors.toList());
    }
}
