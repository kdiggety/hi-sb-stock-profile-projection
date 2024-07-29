package hobbyinvestor.controller;

import hobbyinvestor.model.CompanyProfile;
import hobbyinvestor.service.CompanyProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class CompanyProfileController {
    private final CompanyProfileService companyProfileService;;

    @QueryMapping
    public CompanyProfile companyProfileByTicker(@Argument String ticker) {
        return companyProfileService.getCompanyProfile(ticker);
    }
}