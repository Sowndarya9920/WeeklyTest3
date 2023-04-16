package componentScan;

import org.springframework.stereotype.Component;

@Component
public class Buyer {

    public String buy()
    {
        return "Ordered a product called head-phones";
    }
}
