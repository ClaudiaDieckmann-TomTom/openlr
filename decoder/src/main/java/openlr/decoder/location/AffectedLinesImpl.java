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
package openlr.decoder.location;

import java.util.ArrayList;
import java.util.List;

import openlr.location.data.AffectedLines;
import openlr.map.Line;

/**
 * The Class AffectedLines.
 */
public class AffectedLinesImpl implements AffectedLines {
	
	/** The Constant EMPTY. */
	public static final AffectedLines EMPTY = new AffectedLinesImpl();
	
	/** The covered lines. */
	private final List<Line> coveredLines = new ArrayList<Line>();
	
	/** The intersected lines. */
	private final List<Line> intersectedLines = new ArrayList<Line>();
	
	/**
	 * Instantiates a new affected lines implementation with no lines being affected.
	 */
	private AffectedLinesImpl() {
	}
	
	
	/**
	 * Instantiates a new affected lines.
	 *
	 * @param covered the covered
	 * @param intersected the intersected
	 */
	public AffectedLinesImpl(final List<? extends Line> covered, final List<? extends Line> intersected) {
		intersectedLines.addAll(intersected);
		coveredLines.addAll(covered);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public final List<Line> getCoveredLines() {
		return coveredLines;
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public final List<Line> getIntersectedLines() {
		return intersectedLines;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public final boolean hasCoveredLines() {
		return !coveredLines.isEmpty();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public final boolean hasIntersectedLines() {
		return !intersectedLines.isEmpty();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public final boolean isEmpty() {
		return (!hasCoveredLines() && !hasIntersectedLines());
	}

}
