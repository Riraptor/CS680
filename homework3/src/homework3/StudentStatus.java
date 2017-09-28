
package homework3;

public enum StudentStatus {
	INSTATE{
			@Override
			public float getTuition(){
			return 1000;}},
	OUTSTATE{
			@Override
			public float getTuition(){
			return 2000;}},
	INTL{
			@Override
			public float getTuition(){
			return 4000;}};
	//@Override
	public float getTuition() {
	return 9000;
	}
			
			
}
