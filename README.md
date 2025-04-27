# Company Profile Projection

### A. Get Company Profile HTTP
http://localhost:9081/company-service/companyProfiles/BLHI

### B. GraphIQL
#### API Endpoint
http://localhost:9081/company-service/graphql
#### GraphIQL URL
http://localhost:9081/company-service/graphiql?path=/company-service/graphql
#### Example Query
```
query {
  companyProfileByTicker(ticker: "BLHI") {
    ticker
    country
    currency
    estimateCurrency
    exchange
    finnhubIndustry
    ipo
    logo
    marketCapitalization
    name
    phone
    shareOutstanding
    weburl
  }
}
```