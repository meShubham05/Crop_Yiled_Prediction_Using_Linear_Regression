package Linear_Regression_Services;


import java.util.List;

public interface Product_Of_Dev_of_X_Y_Service {

	List<Float> product_of_Dev_X_and_Y( String cropname);
	List<Float> product_of_Dev_X_rainfall_and_Y( String cropname);
	List<Float> product_of_Dev_X_pH_and_Y( String cropname);
	List<Float> product_of_Dev_X__fertilizerand_Y( String cropname);

}
