@Service
public class FlightService {

    @Autowired
    private FlightRepository repo;

    public List<Flight> getAllFlights() {
        return repo.findAll();
    }

    public Flight saveFlight(Flight flight) {
        return repo.save(flight);
    }
}
