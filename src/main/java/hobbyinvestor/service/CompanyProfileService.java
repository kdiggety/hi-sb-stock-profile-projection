package hobbyinvestor.service;

import hobbyinvestor.model.CompanyProfile;
import hobbyinvestor.repository.elasticsearch.CompanyProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CompanyProfileService {
    private final CompanyProfileRepository companyProfileRepository;

    public CompanyProfile getCompanyProfile(String ticker) {
        return companyProfileRepository.findById(ticker).orElse(null);
    }
}
