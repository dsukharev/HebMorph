/***************************************************************************
 *   Copyright (C) 2010-2013 by                                            *
 *      Itamar Syn-Hershko <itamar at code972 dot com>                     *
 *		Ofer Fort <oferiko at gmail dot com> (initial Java port)           *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU Affero General Public License           *
 *   version 3, as published by the Free Software Foundation.              *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU Affero General Public License for more details.                   *
 *                                                                         *
 *   You should have received a copy of the GNU Affero General Public      *
 *   License along with this program; if not, see                          *
 *   <http://www.gnu.org/licenses/>.                                       *
 **************************************************************************/
package com.code972.hebmorph.hspell;

public final class Constants
{
    public static final String dictionaryFile = "hebrew.wgz";
    public static final String prefixesFile = dictionaryFile + ".prefixes";
    public static final String stemsFile = dictionaryFile + ".stems";
    public static final String descFile = dictionaryFile + ".desc";
    public static final String sizesFile = dictionaryFile + ".sizes";
    public static final String dmaskFile = "dmask.c";
    public static final int MaxWordLength = Byte.MAX_VALUE;

	public static final String prefixes_noH[] ={/*"",*/
		"ב",
		"בכ",
		"ה",
		"ו",
		"וב",
		"ובכ",
		"וה",
		"וכ",
		"וכב",
		"וככ",
		"וכל",
		"וכמ",
		"וכמה",
		"וכש",
		"וכשב",
		"וכשבכ",
		"וכשה",
		"וכשכ",
		"וכשכב",
		"וכשככ",
		"וכשכל",
		"וכשכמ",
		"וכשכמה",
		"וכשל",
		"וכשלכ",
		"וכשמ",
		"וכשמה",
		"וכשמכ",
		"ול",
		"ולכ",
		"ולכש",
		"ולכשב",
		"ולכשבכ",
		"ולכשה",
		"ולכשכ",
		"ולכשכב",
		"ולכשככ",
		"ולכשכל",
		"ולכשכמ",
		"ולכשכמה",
		"ולכשל",
		"ולכשלכ",
		"ולכשמ",
		"ולכשמה",
		"ולכשמכ",
		"ומ",
		"ומה",
		"ומכ",
		"ומש",
		"ומשב",
		"ומשבכ",
		"ומשה",
		"ומשכ",
		"ומשכב",
		"ומשככ",
		"ומשכל",
		"ומשכמ",
		"ומשכמה",
		"ומשל",
		"ומשלכ",
		"ומשמ",
		"ומשמה",
		"ומשמכ",
		"וש",
		"ושב",
		"ושבכ",
		"ושה",
		"ושכ",
		"ושכב",
		"ושככ",
		"ושכל",
		"ושכמ",
		"ושכמה",
		"ושכש",
		"ושכשב",
		"ושכשבכ",
		"ושכשה",
		"ושכשכ",
		"ושכשכב",
		"ושכשככ",
		"ושכשכל",
		"ושכשכמ",
		"ושכשכמה",
		"ושכשל",
		"ושכשלכ",
		"ושכשמ",
		"ושכשמה",
		"ושכשמכ",
		"ושל",
		"ושלכ",
		"ושלכש",
		"ושלכשב",
		"ושלכשבכ",
		"ושלכשה",
		"ושלכשכ",
		"ושלכשכב",
		"ושלכשככ",
		"ושלכשכל",
		"ושלכשכמ",
		"ושלכשכמה",
		"ושלכשל",
		"ושלכשלכ",
		"ושלכשמ",
		"ושלכשמה",
		"ושלכשמכ",
		"ושמ",
		"ושמה",
		"ושמכ",
		"ושמש",
		"ושמשב",
		"ושמשבכ",
		"ושמשה",
		"ושמשכ",
		"ושמשכב",
		"ושמשככ",
		"ושמשכל",
		"ושמשכמ",
		"ושמשכמה",
		"ושמשל",
		"ושמשלכ",
		"ושמשמ",
		"ושמשמה",
		"ושמשמכ",
		"כ",
		"כב",
		"ככ",
		"כל",
		"כמ",
		"כמה",
		"כש",
		"כשב",
		"כשבכ",
		"כשה",
		"כשכ",
		"כשכב",
		"כשככ",
		"כשכל",
		"כשכמ",
		"כשכמה",
		"כשל",
		"כשלכ",
		"כשמ",
		"כשמה",
		"כשמכ",
		"ל",
		"לכ",
		"לכש",
		"לכשב",
		"לכשבכ",
		"לכשה",
		"לכשכ",
		"לכשכב",
		"לכשככ",
		"לכשכל",
		"לכשכמ",
		"לכשכמה",
		"לכשל",
		"לכשלכ",
		"לכשמ",
		"לכשמה",
		"לכשמכ",
		"מ",
		"מב",
		"מה",
		"מכ",
		"מל",
		"מש",
		"משב",
		"משבכ",
		"משה",
		"משכ",
		"משכב",
		"משככ",
		"משכל",
		"משכמ",
		"משכמה",
		"משל",
		"משלכ",
		"משמ",
		"משמה",
		"משמכ",
		"ש",
		"שב",
		"שבכ",
		"שה",
		"שכ",
		"שכב",
		"שככ",
		"שכל",
		"שכמ",
		"שכמה",
		"שכש",
		"שכשב",
		"שכשבכ",
		"שכשה",
		"שכשכ",
		"שכשכב",
		"שכשככ",
		"שכשכל",
		"שכשכמ",
		"שכשכמה",
		"שכשל",
		"שכשלכ",
		"שכשמ",
		"שכשמה",
		"שכשמכ",
		"של",
		"שלכ",
		"שלכש",
		"שלכשב",
		"שלכשבכ",
		"שלכשה",
		"שלכשכ",
		"שלכשכב",
		"שלכשככ",
		"שלכשכל",
		"שלכשכמ",
		"שלכשכמה",
		"שלכשל",
		"שלכשלכ",
		"שלכשמ",
		"שלכשמה",
		"שלכשמכ",
		"שמ",
		"שמה",
		"שמכ",
		"שמש",
		"שמשב",
		"שמשבכ",
		"שמשה",
		"שמשכ",
		"שמשכב",
		"שמשככ",
		"שמשכל",
		"שמשכמ",
		"שמשכמה",
		"שמשל",
		"שמשלכ",
		"שמשמ",
		"שמשמה",
		"שמשמכ", null};
	public static final int masks_noH[] ={/*60,*/
		43,
		42,
		32,
		60,
		43,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		32,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		44,
		43,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		32,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		42,
		32,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		44,
		43,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		32,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		-1};
	public static final String prefixes_H[] ={/*"",*/
		"ב",
		"בכ",
		"ה",
		"הב",
		"הבכ",
		"הה",
		"הכ",
		"הכב",
		"הככ",
		"הכל",
		"הכמ",
		"הכמה",
		"הכש",
		"הכשב",
		"הכשבכ",
		"הכשה",
		"הכשכ",
		"הכשכב",
		"הכשככ",
		"הכשכל",
		"הכשכמ",
		"הכשכמה",
		"הכשל",
		"הכשלכ",
		"הכשמ",
		"הכשמה",
		"הכשמכ",
		"הל",
		"הלכ",
		"הלכש",
		"הלכשב",
		"הלכשבכ",
		"הלכשה",
		"הלכשכ",
		"הלכשכב",
		"הלכשככ",
		"הלכשכל",
		"הלכשכמ",
		"הלכשכמה",
		"הלכשל",
		"הלכשלכ",
		"הלכשמ",
		"הלכשמה",
		"הלכשמכ",
		"המ",
		"המה",
		"המכ",
		"המש",
		"המשב",
		"המשבכ",
		"המשה",
		"המשכ",
		"המשכב",
		"המשככ",
		"המשכל",
		"המשכמ",
		"המשכמה",
		"המשל",
		"המשלכ",
		"המשמ",
		"המשמה",
		"המשמכ",
		"ו",
		"וב",
		"ובכ",
		"וה",
		"והב",
		"והבכ",
		"והה",
		"והכ",
		"והכב",
		"והככ",
		"והכל",
		"והכמ",
		"והכמה",
		"והכש",
		"והכשב",
		"והכשבכ",
		"והכשה",
		"והכשכ",
		"והכשכב",
		"והכשככ",
		"והכשכל",
		"והכשכמ",
		"והכשכמה",
		"והכשל",
		"והכשלכ",
		"והכשמ",
		"והכשמה",
		"והכשמכ",
		"והל",
		"והלכ",
		"והלכש",
		"והלכשב",
		"והלכשבכ",
		"והלכשה",
		"והלכשכ",
		"והלכשכב",
		"והלכשככ",
		"והלכשכל",
		"והלכשכמ",
		"והלכשכמה",
		"והלכשל",
		"והלכשלכ",
		"והלכשמ",
		"והלכשמה",
		"והלכשמכ",
		"והמ",
		"והמה",
		"והמכ",
		"והמש",
		"והמשב",
		"והמשבכ",
		"והמשה",
		"והמשכ",
		"והמשכב",
		"והמשככ",
		"והמשכל",
		"והמשכמ",
		"והמשכמה",
		"והמשל",
		"והמשלכ",
		"והמשמ",
		"והמשמה",
		"והמשמכ",
		"וכ",
		"וכב",
		"וככ",
		"וכל",
		"וכמ",
		"וכמה",
		"וכש",
		"וכשב",
		"וכשבכ",
		"וכשה",
		"וכשכ",
		"וכשכב",
		"וכשככ",
		"וכשכל",
		"וכשכמ",
		"וכשכמה",
		"וכשל",
		"וכשלכ",
		"וכשמ",
		"וכשמה",
		"וכשמכ",
		"ול",
		"ולכ",
		"ולכש",
		"ולכשב",
		"ולכשבכ",
		"ולכשה",
		"ולכשכ",
		"ולכשכב",
		"ולכשככ",
		"ולכשכל",
		"ולכשכמ",
		"ולכשכמה",
		"ולכשל",
		"ולכשלכ",
		"ולכשמ",
		"ולכשמה",
		"ולכשמכ",
		"ומ",
		"ומה",
		"ומכ",
		"ומש",
		"ומשב",
		"ומשבכ",
		"ומשה",
		"ומשכ",
		"ומשכב",
		"ומשככ",
		"ומשכל",
		"ומשכמ",
		"ומשכמה",
		"ומשל",
		"ומשלכ",
		"ומשמ",
		"ומשמה",
		"ומשמכ",
		"וש",
		"ושב",
		"ושבכ",
		"ושה",
		"ושכ",
		"ושכב",
		"ושככ",
		"ושכל",
		"ושכמ",
		"ושכמה",
		"ושכש",
		"ושכשב",
		"ושכשבכ",
		"ושכשה",
		"ושכשכ",
		"ושכשכב",
		"ושכשככ",
		"ושכשכל",
		"ושכשכמ",
		"ושכשכמה",
		"ושכשל",
		"ושכשלכ",
		"ושכשמ",
		"ושכשמה",
		"ושכשמכ",
		"ושל",
		"ושלכ",
		"ושלכש",
		"ושלכשב",
		"ושלכשבכ",
		"ושלכשה",
		"ושלכשכ",
		"ושלכשכב",
		"ושלכשככ",
		"ושלכשכל",
		"ושלכשכמ",
		"ושלכשכמה",
		"ושלכשל",
		"ושלכשלכ",
		"ושלכשמ",
		"ושלכשמה",
		"ושלכשמכ",
		"ושמ",
		"ושמה",
		"ושמכ",
		"ושמש",
		"ושמשב",
		"ושמשבכ",
		"ושמשה",
		"ושמשכ",
		"ושמשכב",
		"ושמשככ",
		"ושמשכל",
		"ושמשכמ",
		"ושמשכמה",
		"ושמשל",
		"ושמשלכ",
		"ושמשמ",
		"ושמשמה",
		"ושמשמכ",
		"כ",
		"כב",
		"ככ",
		"כל",
		"כמ",
		"כמה",
		"כש",
		"כשב",
		"כשבכ",
		"כשה",
		"כשכ",
		"כשכב",
		"כשככ",
		"כשכל",
		"כשכמ",
		"כשכמה",
		"כשל",
		"כשלכ",
		"כשמ",
		"כשמה",
		"כשמכ",
		"ל",
		"לכ",
		"לכש",
		"לכשב",
		"לכשבכ",
		"לכשה",
		"לכשכ",
		"לכשכב",
		"לכשככ",
		"לכשכל",
		"לכשכמ",
		"לכשכמה",
		"לכשל",
		"לכשלכ",
		"לכשמ",
		"לכשמה",
		"לכשמכ",
		"מ",
		"מב",
		"מה",
		"מכ",
		"מל",
		"מש",
		"משב",
		"משבכ",
		"משה",
		"משכ",
		"משכב",
		"משככ",
		"משכל",
		"משכמ",
		"משכמה",
		"משל",
		"משלכ",
		"משמ",
		"משמה",
		"משמכ",
		"ש",
		"שב",
		"שבכ",
		"שה",
		"שכ",
		"שכב",
		"שככ",
		"שכל",
		"שכמ",
		"שכמה",
		"שכש",
		"שכשב",
		"שכשבכ",
		"שכשה",
		"שכשכ",
		"שכשכב",
		"שכשככ",
		"שכשכל",
		"שכשכמ",
		"שכשכמה",
		"שכשל",
		"שכשלכ",
		"שכשמ",
		"שכשמה",
		"שכשמכ",
		"של",
		"שלכ",
		"שלכש",
		"שלכשב",
		"שלכשבכ",
		"שלכשה",
		"שלכשכ",
		"שלכשכב",
		"שלכשככ",
		"שלכשכל",
		"שלכשכמ",
		"שלכשכמה",
		"שלכשל",
		"שלכשלכ",
		"שלכשמ",
		"שלכשמה",
		"שלכשמכ",
		"שמ",
		"שמה",
		"שמכ",
		"שמש",
		"שמשב",
		"שמשבכ",
		"שמשה",
		"שמשכ",
		"שמשכב",
		"שמשככ",
		"שמשכל",
		"שמשכמ",
		"שמשכמה",
		"שמשל",
		"שמשלכ",
		"שמשמ",
		"שמשמה",
		"שמשמכ", null};

	public static final int masks_H[] ={/*60,*/
		43,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		32,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		60,
		43,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		32,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		42,
		32,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		32,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		44,
		43,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		32,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		42,
		32,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		44,
		43,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		42,
		32,
		42,
		44,
		42,
		42,
		32,
		42,
		42,
		42,
		42,
		42,
		32,
		42,
		42,
		42,
		32,
		42,
		-1};

    public static interface DMask
	{
	    public static final int D_NOUN = 1;
	    public static final int D_VERB = 2;
	    public static final int D_ADJ = 3;
	    public static final int D_TYPEMASK = 3;
	    public static final int D_GENDERBASE = 4;
	    public static final int D_MASCULINE = 4;
	    public static final int D_FEMININE = 8;
	    public static final int D_GENDERMASK = 12;
	    public static final int D_GUFBASE = 16;
	    public static final int D_FIRST = 16;
	    public static final int D_SECOND = 32;
	    public static final int D_THIRD = 48;
	    public static final int D_GUFMASK = 48;
	    public static final int D_NUMBASE = 64;
	    public static final int D_SINGULAR = 64;
	    public static final int D_DOUBLE = 128;
	    public static final int D_PLURAL = 192;
	    public static final int D_NUMMASK = 192;
	    public static final int D_TENSEBASE = 256;
	    public static final int D_INFINITIVE = 256;
	    public static final int D_BINFINITIVE = 1536;
	    public static final int D_PAST = 512;
	    public static final int D_PRESENT = 768;
	    public static final int D_FUTURE = 1024;
	    public static final int D_IMPERATIVE = 1280;
	    public static final int D_TENSEMASK = 1792;
	    public static final int D_OGENDERBASE = 2048;
	    public static final int D_OMASCULINE = 2048;
	    public static final int D_OFEMININE = 4096;
	    public static final int D_OGENDERMASK = 6144;
	    public static final int D_OGUFBASE = 8192;
	    public static final int D_OFIRST = 8192;
	    public static final int D_OSECOND = 16384;
	    public static final int D_OTHIRD = 24576;
	    public static final int D_OGUFMASK = 24576;
	    public static final int D_ONUMBASE = 32768;
	    public static final int D_OSINGULAR = 32768;
	    public static final int D_ODOUBLE = 65536;
	    public static final int D_OPLURAL = 98304;
	    public static final int D_ONUMMASK = 98304;
	    public static final int D_OMASK = 129024;
	    public static final int D_OSMICHUT = 131072;
	    public static final int D_SPECNOUN = 262144;
	    public static final int D_STARTBIT = 524288;
	    public static final int D_ACRONYM = 1048576;
	}

	public static interface PrefixType
	{
	    public static final int PS_ALL = 63;
	    public static final int PS_B = 1;
	    public static final int PS_L = 2;
	    public static final int PS_VERB = 4;
	    public static final int PS_NONDEF = 8;
	    public static final int PS_IMPER = 16;
	    public static final int PS_MISC = 32;
	}

}
