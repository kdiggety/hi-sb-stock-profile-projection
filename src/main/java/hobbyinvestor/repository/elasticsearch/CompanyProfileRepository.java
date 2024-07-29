package hobbyinvestor.repository.elasticsearch;

import hobbyinvestor.model.CompanyProfile;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyProfileRepository extends ElasticsearchRepository<CompanyProfile, String> {
}
