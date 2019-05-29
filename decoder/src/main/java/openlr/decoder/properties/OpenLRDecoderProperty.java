/**
 * Licensed to the TomTom International B.V. under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  TomTom International B.V.
 * licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/**
 *  Copyright (C) 2009-2012 TomTom International B.V.
 *
 *   TomTom (Legal Department)
 *   Email: legal@tomtom.com
 *
 *   TomTom (Technical contact)
 *   Email: openlr@tomtom.com
 *
 *   Address: TomTom International B.V., Oosterdoksstraat 114, 1011DK Amsterdam,
 *   the Netherlands
 */
package openlr.decoder.properties;

import java.util.HashMap;

import openlr.properties.OpenLRProperty;
import openlr.properties.PropertyType;

/**
 * The Enum OpenLRDecoderProperty.
 * 
 * 
 * <p>
 * OpenLR is a trade mark of TomTom International B.V.
 * <p>
 * email: software@openlr.org
 * 
 * @author TomTom International B.V.
 */
public enum OpenLRDecoderProperty implements OpenLRProperty {
	
	//CHECKSTYLE:OFF

	/** The BEA r_ dist. */
	BEAR_DIST("BearingDistance", PropertyType.INTEGER, 20),

	/** The MA x_ nod e_ dis. */
	MAX_NODE_DIST("MaxNodeDistance", PropertyType.INTEGER, 100),

	/** The NOD e_ factor. */
	NODE_FACTOR("NodeFactor", PropertyType.INTEGER, 3),

	/** The LIN e_ factor. */
	LINE_FACTOR("LineFactor", PropertyType.INTEGER, 3),

	/** The FR c_ vairance. */
	FRC_VARIANCE("FRC_Variance", PropertyType.INTEGER, 2),

	/** The MI n_ ac c_ rating. */
	MIN_ACC_RATING("MinimumAcceptedRating", PropertyType.INTEGER, 800),

	/** The MA x_ n r_ retries. */
	MAX_NR_RETRIES("MaxNumberRetries", PropertyType.INTEGER, 3),

	/** The SAM e_ lin e_ degrad. */
	SAME_LINE_DEGRAD("SameLineDegradation", PropertyType.FLOAT, 0.10f),

	/** The CONNEC t_ rout e_ inc. */
	CONNECT_ROUTE_INC("ConnectedRouteIncrease", PropertyType.FLOAT, 0.10f),

	/** The DN p_ variance. */
	DNP_VARIANCE("DNPVariance", PropertyType.INTEGER, 118),

	/** The MA x_ bea r_ diff. */
	MAX_BEAR_DIFF("maxBearingDiff", PropertyType.INTEGER, 90),

	/** The FR c_ rating. */
	@SuppressWarnings("serial")
	FRC_RATING("FRC_Rating", PropertyType.INTEGER_BY_MAP,
			new HashMap<String, Integer>() {
				{
					put("Excellent", 100);
					put("Good", 75);
					put("Average", 50);
					put("Poor", 0);
				}
			}),

	/** The FR c_ intervals. */
	@SuppressWarnings("serial")
	FRC_INTERVALS("FRC_Intervals", PropertyType.INTEGER_BY_MAP,
			new HashMap<String, Integer>() {
				{
					put("Excellent", 0);
					put("Good", 1);
					put("Average", 2);
				}
			}),

	/** The FO w_ rating. */
	@SuppressWarnings("serial")
	FOW_RATING("FOW_Rating", PropertyType.INTEGER_BY_MAP,
			new HashMap<String, Integer>() {
				{
					put("Excellent", 100);
					put("Good", 50);
					put("Average", 50);
					put("Poor", 25);
				}
			}),

	/** The BEA r_ rating. */
	@SuppressWarnings("serial")
	BEAR_RATING("Bearing_Rating", PropertyType.INTEGER_BY_MAP,
			new HashMap<String, Integer>() {
				{
					put("Excellent", 100);
					put("Good", 50);
					put("Average", 25);
					put("Poor", 0);
				}
			}),

	/** The BEA r_ intervals. */
	@SuppressWarnings("serial")
	BEAR_INTERVALS("Bearing_Intervals", PropertyType.INTEGER_BY_MAP,
			new HashMap<String, Integer>() {
				{
					put("Excellent", 6);
					put("Good", 12);
					put("Average", 18);
				}
			}),

	/** The CAL c_ affecte d_ lines. */
	CALC_AFFECTED_LINES("Calc_Affected_Lines", PropertyType.BOOLEAN, false),
	
	/** The LINE s_ directl y_ factor. */
	LINES_DIRECTLY_FACTOR("Lines_Directly_Factor", PropertyType.FLOAT, 0.95f),

	/** The COM p_ tim e_4_ cache. */
	COMP_TIME_4_CACHE("CompTime4Cache", PropertyType.INTEGER, 0);

	/**
	 * Instantiates a new open lr decoder properties.
	 * 
	 * @param s
	 *            the s
	 * @param c
	 *            the c
	 * @param d
	 *            the d
	 */
	private OpenLRDecoderProperty(final String s, final PropertyType c,
			final Object d) {
		key = s;
		propertyType = c;
		defaultValue = d;
	}

	/** The key. */
	private final String key;

	/** The class type. */
	private final PropertyType propertyType;

	/** The default value. */
	private final Object defaultValue;

	/**
	 * Gets the key.
	 * 
	 * @return the key {@inheritDoc}
	 */
	@Override
	public final String getKey() {
		return key;
	}

	/**
	 * Gets the property type.
	 * 
	 * @return the property type {@inheritDoc}
	 */
	@Override
	public final PropertyType getPropertyType() {
		return propertyType;
	}

	/**
	 * Gets the default.
	 * 
	 * @return the default {@inheritDoc}
	 */
	@Override
	public final Object getDefault() {
		return defaultValue;
	}
	
	//CHECKSTYLE:ON

}
