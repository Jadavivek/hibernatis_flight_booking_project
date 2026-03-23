@Controller
public class FlightController {

    @Autowired
    private FlightService service;

    @GetMapping("/flights")
    public String getFlights(Model model) {
        model.addAttribute("flights", service.getAllFlights());
        return "flights";
    }
}
