package hobbyinvestor.service;

import hobbyinvestor.model.CompanyProfile;
import hobbyinvestor.repository.elasticsearch.CompanyProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CompanyProfileService {
    private final CompanyProfileRepository companyProfileRepository;

    public Iterable<CompanyProfile> getCompanyProfile(int count, int page) {
        Pageable pageable = PageRequest.of(page, count);
        return companyProfileRepository.findAll(pageable);
    }

    public CompanyProfile getCompanyProfile(String ticker) {
        return companyProfileRepository.findById(ticker).orElse(null);
    }
}
