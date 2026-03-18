import java.util.*;

/**
   Chapter 18, Programming Challenge 4
*/

public class StockMap
{
   // The Map to store ojects using their symbol as the key
   private Map<String, Stock> stockMap;
   
   /**
      Constructor
   */
   
   public StockMap()
   {
      // Initialize the map
      stockMap = new HashMap<>();
   }
   
   /**
      The add method puts a mapping into the map.
      It maps a stock symbol with the Stock object.
      @param stock The stock object.
   */
   
   public void add(Stock stock)
   {
      // Put a mapping into the map. The stock
      // symbol is the key.
      stockMap.put(stock.getSymbol(), stock);

   }
   
   /**
      The getStock method retrieves the Stock object
      that is associated with a symbol.
      @param symbol The symbol for a stock/
      @return The Stock object associated with the symbol
              or null if the symbol is not found.
   */
   
   public Stock getStock(String symbol)
   {
      // Retrieve the stock object by symbol
      return stockMap.get(symbol);
   }
}