
public class ProductVolumePricesProvider extends AbstractPropertyFieldValueProvider implements FieldValueProvider{

    public boolean getFieldValue(SearchQuery query, String facetValue){
        if (facetValue == null){
            return false;
        } else{
            if (query.getName() == facetValue){
                return true;
            } else{
                return false;
            }
        }
    }
}