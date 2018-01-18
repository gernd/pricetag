package br.com.lucasfelix.pricetag;

public class App {
    public static void main(final String[] args) throws ScraperNotFound, ParseException {
        final PriceTag pricetag = new PriceTag();
        final Product product = pricetag
                .process("https://www.amazon.de/Nintendo-2500066-Switch-Konsole-Grau/dp/B01M6ZGICT");
        System.out.println(product.getPriceAsText());
    }
}
