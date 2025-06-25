@Entity
public class Medication {
  @Id @GeneratedValue private Long id;
  @ManyToOne private Patient patient;
  @NotBlank private String name;
  @NotBlank private String dosage;
  private String frequency;
}
