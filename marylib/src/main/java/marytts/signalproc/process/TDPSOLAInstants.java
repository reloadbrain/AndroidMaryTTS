/**
 * Copyright 2007 DFKI GmbH.
 * All Rights Reserved.  Use is subject to license terms.
 * <p/>
 * Permission is hereby granted, free of charge, to use and distribute
 * this software and its documentation without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of this work, and to
 * permit persons to whom this work is furnished to do so, subject to
 * the following conditions:
 * <p/>
 * 1. The code must retain the above copyright notice, this list of
 * conditions and the following disclaimer.
 * 2. Any modifications must be clearly marked as such.
 * 3. Original authors' names are not deleted.
 * 4. The authors' names are not used to endorse or promote products
 * derived from this software without specific prior written
 * permission.
 * <p/>
 * DFKI GMBH AND THE CONTRIBUTORS TO THIS WORK DISCLAIM ALL WARRANTIES WITH
 * REGARD TO THIS SOFTWARE, INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS, IN NO EVENT SHALL DFKI GMBH NOR THE
 * CONTRIBUTORS BE LIABLE FOR ANY SPECIAL, INDIRECT OR CONSEQUENTIAL
 * DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR
 * PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 * ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF
 * THIS SOFTWARE.
 */

package marytts.signalproc.process;

/**
 * @author oytun.turk
 */
public class TDPSOLAInstants {
    public float[] synthesisInstantsInSeconds;
    public float[] analysisInstantsInSeconds;
    public int[] repeatSkipCounts;

    public TDPSOLAInstants(int totalSynthesisFrames) {
        if (totalSynthesisFrames > 0) {
            synthesisInstantsInSeconds = new float[totalSynthesisFrames];
            analysisInstantsInSeconds = new float[totalSynthesisFrames];
            repeatSkipCounts = new int[totalSynthesisFrames];
        } else {
            synthesisInstantsInSeconds = null;
            analysisInstantsInSeconds = null;
            repeatSkipCounts = null;
        }
    }
}
