@Service
public class BookingService {

    @Autowired
    private BookingRepository repo;

    public Booking bookTicket(Booking booking) {
        booking.setStatus("BOOKED");
        return repo.save(booking);
    }
}
