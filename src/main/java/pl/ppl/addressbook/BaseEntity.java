package pl.ppl.addressbook;

import lombok.Getter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public class BaseEntity<T extends Serializable> {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private T id;
}
