
package com.deloitte;

import java.util.StringTokenizer;

public class StringTokenTest {



		public static void main(String[] args) {
			String str = "Mon, Tue, Wed, Thu, Fri";
			StringTokenizer st = new StringTokenizer(str, ",");
			int count = st.countTokens();
			System.out.println("Tokens: " +count);
			while(st.hasMoreElements()) {
				String tkn = st.nextToken();
				System.out.println(tkn);
		}
			System.out.println("-------------");
			String[] strArr = str.split(","); //using regular expression
			for (String tkn : strArr) {
				System.out.println(tkn);
			}

	}


}
