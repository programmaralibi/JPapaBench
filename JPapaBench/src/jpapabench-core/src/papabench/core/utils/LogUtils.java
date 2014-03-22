/* $Id$
 * 
 * This file is a part of jPapaBench providing a Java implementation 
 * of PapaBench project.
 * Copyright (C) 2010  Michal Malohlava <michal.malohlava_at_d3s.mff.cuni.cz>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 * 
 */
package papabench.core.utils;

import java.io.PrintStream;
//import javax.realtime.RealtimeThread;

/**
 * Simple log utils.
 * 
 * @author Michal Malohlava
 *
 */
final public class LogUtils {
	
/*	public static final int maxTraces = 100;
	static public long[] missionMemUsage = new long[maxTraces];
	private static int traces = 0;

	public static final void saveMemUsage() {
		missionMemUsage[traces] = RealtimeThread.getOuterMemoryArea(1).memoryConsumed();
		traces++;
	}

	public static final void printMemUsage() {
		for(int i = 0; i < traces; i++) {
			System.out.println("Trace " + i + " mission memory usage: " + missionMemUsage[i]);
		}
	}
*/

	public static final void log(Object o, String msg) {
		log(System.out, o.getClass().getName(), msg);
	}
	
	public static final void log(PrintStream os, String s, String msg) {
		os.print(s);
		os.print(": ");
		os.println(msg);		
	}
	
	public static final void log(String name, String msg) {
		log(System.out, name, msg);
	}

}
