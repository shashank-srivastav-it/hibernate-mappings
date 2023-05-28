package com.backend.hibernateadvance.mapping.entity;

import com.backend.hibernateadvance.mapping.enumeration.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SortComparator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(length = 36, columnDefinition = "varchar(36)", updatable = false, nullable = false)
    private UUID id;

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

    @JsonIgnore
    @CreationTimestamp
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime createTime;

    @JsonIgnore
    @UpdateTimestamp
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime updateTime;

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
//    @Column(name = "description")
//    private Map<String, String> images = new HashMap<>();

//    @ElementCollection
//    @CollectionTable(name="image")
//    @org.hibernate.annotations.OrderBy(clause = "file_name desc") //default asc
//    @Column(name="file_name")
//    private Set<String> images = new LinkedHashSet<>();

//    @ElementCollection
//    @CollectionTable(name = "image")
//    @MapKeyColumn(name = "file_name") //Maps Key
//    @Column(name = "description") //Maps Value
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
