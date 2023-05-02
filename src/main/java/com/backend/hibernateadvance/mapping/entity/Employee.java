package com.backend.hibernateadvance.mapping.entity;

import com.backend.hibernateadvance.mapping.enumeration.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@Entity
@NoArgsConstructor
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "firstname cannot be empty")
    @Pattern(regexp = "[a-zA-Z]+", message = "firstname should contains only alphabetic characters")
    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;

    @Column(name = "last_name", length = 20)
    private String lastName;

    @Email(message = "enter valid email address")
    @Column(name = "email", nullable = false, unique = true, updatable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @Valid
    @Embedded
    private Address homeAddress;

    @Valid
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "billing_street")),
            @AttributeOverride(name = "zipcode", column = @Column(name = "billing_zipcode")),
            @AttributeOverride(name = "city", column = @Column(name = "billing_city")),
    })
    private Address billingAddress;

    @Column(columnDefinition = "TEXT")
    private String about;

//    @ElementCollection
//    @CollectionTable(name = "image", joinColumns = @JoinColumn(name = "employee_id"))
//    @Column(name = "file_name")
//    private Set<String> images = new HashSet<>();

//    @ElementCollection
//    @CollectionTable(name = "image")
//    @OrderColumn(name = "index")
//    @Column(name = "file_name")
//    private List<String> images = new ArrayList<>();

//    @ElementCollection
//    @CollectionTable(name = "image")
//    @MapKeyColumn(name = "file_name")
//    @Column(name = "image_name")
//    private Map<String, String> images = new HashMap<>();

//    @ElementCollection
//    @CollectionTable(name="image")
//    @org.hibernate.annotations.OrderBy(clause = "file_name desc") //default asc
//    @Column(name="file_name")
//    private Set<String> images = new LinkedHashSet<>();

//    @ElementCollection
//    @CollectionTable(name = "image")
//    @MapKeyColumn(name = "file_name") //Maps Key
//    @Column(name = "image_name") //Maps Value
//    @SortComparator(ReverseStringComparator.class)
//    private SortedMap<String, String> images = new TreeMap<>();
//
//    public static class ReverseStringComparator implements Comparator<String> {
//        @Override
//        public int compare(String o1, String o2) {
//            return o2.compareTo(o1);
//        }
//    }
}
