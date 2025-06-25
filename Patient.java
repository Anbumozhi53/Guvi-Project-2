@Entity
public class Patient {
  @Id @GeneratedValue private Long id;
  @NotBlank private String firstName;
  @NotBlank private String lastName;
  @Email @NotBlank @Column(unique=true) private String email;
  @OneToMany(mappedBy="patient") private List<Appointment> appointments;
  @OneToMany(mappedBy="patient") private List<Medication> meds;
  // getters/setters
}
