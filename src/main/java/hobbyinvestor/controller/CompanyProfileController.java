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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/companyProfiles")
@RestController
public class CompanyProfileController {
    private final CompanyProfileService companyProfileService;;

    @QueryMapping
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<CompanyProfile> companyProfile(@Argument @RequestParam(required = false) Integer count, @Argument @RequestParam(required = false) Integer page) {
        return companyProfileService.getCompanyProfile(count, page);
    }

    @QueryMapping
    @GetMapping(value = "/{ticker}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyProfile companyProfileByTicker(@Argument @PathVariable String ticker) {
        return companyProfileService.getCompanyProfile(ticker);
    }
}