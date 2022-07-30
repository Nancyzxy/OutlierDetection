/*
*      _______                       _        ____ _     _
*     |__   __|                     | |     / ____| |   | |
*        | | __ _ _ __ ___  ___  ___| |    | (___ | |___| |
*        | |/ _` | '__/ __|/ _ \/ __| |     \___ \|  ___  |
*        | | (_| | |  \__ \ (_) \__ \ |____ ____) | |   | |
*        |_|\__,_|_|  |___/\___/|___/_____/|_____/|_|   |_|
*                                                         
* -----------------------------------------------------------
*
*  TarsosLSH is developed by Joren Six at 
*  The School of Arts,
*  University College Ghent,
*  Hoogpoort 64, 9000 Ghent - Belgium
*  
* -----------------------------------------------------------
*
*  Info    : http://tarsos.0110.be/tag/TarsosLSH
*  Github  : https://github.com/JorenSix/TarsosLSH
*  Releases: http://tarsos.0110.be/releases/TarsosLSH/
* 
*/

package be.tarsos.lsh.families;

import java.io.Serializable;

/**
 * An interface representing a family of hash functions. A hash family has the
 * ability to generate a new member of the family, and can combine hashes
 * generated by a family of hash functions.
 * 
 * @author Joren Six
 * 
 */
public interface HashFamily extends Serializable {

	/**
	 * Create a new hash function of this family.
	 * 
	 * @return A new hash function of this family.
	 */
	HashFunction createHashFunction();

	/**
	 * Combine a number of hashes generated by members of this hash function
	 * family.
	 * 
	 * @param hashes
	 *            The raw hashes that need to be combined.
	 * @return An integer representing a combination of the hashes. Normally,
	 *         unique hash values result in a unique, deterministic combined
	 *         hash value.
	 */
	Integer combine(int[] hashes);
	
	/**
	 * Create a new distance measure.
	 * 
	 * @return The distance measure used to sort neighbourhood candidates.
	 */
	DistanceMeasure createDistanceMeasure();

}
