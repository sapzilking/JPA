package jpabook.jpashop.domain;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
public class Delivery extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    @Embedded
    private Address address;

    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery", fetch = LAZY)
    private Order order;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public jpabook.jpashop.domain.DeliveryStatus getStatus() {
        return status;
    }

    public void setStatus(jpabook.jpashop.domain.DeliveryStatus status) {
        this.status = status;
    }

    public jpabook.jpashop.domain.Order getOrder() {
        return order;
    }

    public void setOrder(jpabook.jpashop.domain.Order order) {
        this.order = order;
    }
}
