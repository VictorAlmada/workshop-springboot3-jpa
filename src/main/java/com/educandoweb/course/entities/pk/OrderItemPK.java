package com.educandoweb.course.entities.pk;

import java.io.Serializable;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@EqualsAndHashCode
@Embeddable
public class OrderItemPK implements Serializable {
	private static final long serialVersionUID = 1L;
	// attributes
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
}
