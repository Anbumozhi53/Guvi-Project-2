@Entity
public class Doctor {
  @Id @GeneratedValue private Long id;
  @NotBlank private String name;
  private String specialty;
 
}
