package com.example.tasks.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

	public Object getCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCategory(Category category2) {
		// TODO Auto-generated method stub
		
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}
}