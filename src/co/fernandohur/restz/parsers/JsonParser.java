package co.fernandohur.restz.parsers;

import java.lang.reflect.Type;

public interface JsonParser {

	/**
	 * 
	 * @param json a json string containing the resulting object's representation
	 * @param type The Type object containing the Class information
	 * @return the object parsed from a json string
	 */
	public <T> T parse(String json, Type type);
}
