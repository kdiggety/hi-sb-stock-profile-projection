package hobbyinvestor.controller;

import hobbyinvestor.model.CompanyProfile;
import hobbyinvestor.service.CompanyProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/companyProfile")
@RestController
public class CompanyProfileController {
    private final CompanyProfileService companyProfileService;;

    @GetMapping(value = "/ticker/{symbol}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyProfile companyProfileByTicker(@PathVariable String symbol) {
        CompanyProfile companyProfile = companyProfileService.getCompanyProfile(symbol);
        return companyProfile;
    }

    @QueryMapping
    public CompanyProfile companyProfileByTicker2(@Argument String ticker) {
        CompanyProfile companyProfile = companyProfileService.getCompanyProfile(ticker);
        return companyProfile;
    }
}