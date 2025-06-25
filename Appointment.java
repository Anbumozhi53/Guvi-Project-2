@Entity
public class Appointment {
  @Id @GeneratedValue private Long id;
  @ManyToOne private Patient patient;
  @ManyToOne private Doctor doctor;
  private LocalDateTime slot;
}
