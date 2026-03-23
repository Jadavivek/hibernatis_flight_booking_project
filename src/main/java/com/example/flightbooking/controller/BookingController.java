@Controller
public class BookingController {

    @Autowired
    private BookingService service;

    @PostMapping("/book")
    public String bookTicket(@ModelAttribute Booking booking) {
        service.bookTicket(booking);
        return "success";
    }
}
