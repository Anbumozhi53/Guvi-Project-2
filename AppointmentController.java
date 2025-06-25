@Controller
@RequestMapping("/appointments")
public class AppointmentController {
  @Autowired private AppointmentService service;

  @GetMapping("/book")
  public String showBooking(Model m, @RequestParam Long patientId) {
    m.addAttribute("patientId", patientId);
    m.addAttribute("doctors", doctorService.findAll());
    return "book-appointment";
  }

  @PostMapping("/book")
  public String book(@RequestParam Long patientId,
                     @RequestParam Long doctorId,
                     @RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.DATE_TIME) LocalDateTime slot,
                     Model m) {
    service.book(patientId, doctorId, slot);
    return "redirect:/appointments/list?patientId="+patientId;
  }
}
