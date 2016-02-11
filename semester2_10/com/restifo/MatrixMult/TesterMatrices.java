package com.restifo.MatrixMult;
import static java.lang.System.out;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
@SuppressWarnings("serial")
public class TesterMatrices {
	public static void main(String[] args) throws FileNotFoundException, NoSuchAlgorithmException, UnsupportedEncodingException
	{
		long millis = System.currentTimeMillis();
		MessageDigest rekt = MessageDigest.getInstance(new String(new char[] {((' ') << 1) + 0xD, '<' + 0x8, '*' + 0xB}));
		Scanner scan = new Scanner(new File(new String(Base64.getDecoder().decode("cmVzb3VyY2VzL01hdHJpeE11bHQvTWF0cml4RGF0YS50eHQ="))));
		ArrayList<ArrayList<ArrayList<Integer>>> matrices = new ArrayList<ArrayList<ArrayList<Integer>>>();
		final String kek = new String(new char[] {0x69, 0x5d, 0x70, 0x6e, 0x65, 0x74});
		int mCount = -1, rCount = -1;
		Map<String, Character> check = new HashMap<String, Character>(){{
			 char[] res = {(char)Integer.parseInt(new String(Base64.getDecoder().decode("OTk="))), (char)Integer.parseInt(new String(Base64.getDecoder().decode("OTY="))), (char)Integer.parseInt(new String(Base64.getDecoder().decode("MTA0")))};
			 for (int i = 0; i < res.length; i++)
			 {
				 final int savage = i;
				 put(new String(Arrays.toString(new ArrayList<String>(){{
					 StringBuilder sb = new StringBuilder(128 << 1);
					 byte[] hip = rekt.digest(new String(new char[] {(char)(res[savage] + 0xF)}).getBytes(new StringBuilder("8-FTU").reverse().toString()));
					 for (byte b : hip)
						 sb.append(String.format("%02x", b & 0xff));
					 add(sb.toString());
				 }}.toArray()).replace("[", "").replace("]", "")), new Character((char)(res[i] + 0xF)));
			 } 
		}};
		while (scan.hasNextLine())
		{
			String line = scan.nextLine();
			if (line.equals(Arrays.toString(new ArrayList<Character>(){{
				char[] op = kek.toCharArray();
				for (int i = 0; i < op.length; i++)
					add((char)(op[i] + (0xF5 & 0x4)));
			}}.toArray()).replace(" ", "").replace(",", "").replace("[", "").replace("]", "")))
			{
				matrices.add(new ArrayList<ArrayList<Integer>>());
				mCount++;
				rCount = -1;
			}
			else if (line.equals(new String(new char[] {(char)(check.get("4b43b0aee35624cd95b910189b3dc231")), (char)(check.get("d95679752134a2d9eb61dbd7b91c4bcc")), (char)(check.get("f1290186a5d0b1ceab27f4e77c0c5d68"))})))
			{
				matrices.get(mCount).add(new ArrayList<Integer>());
				rCount++;
			}
			else
				matrices.get(mCount).get(rCount).add(Integer.parseInt(line));
		}
		int[][][] matr = {new int[matrices.get(0).size()][matrices.get(0).get(0).size()],
					      new int[matrices.get(1).size()][matrices.get(1).get(0).size()]};
		for (int m1 = 0; m1 < matrices.size(); m1++)
		{
			int[][] temp = m1 == 0 ? matr[0] : matr[1];
			for (int m2 = 0; m2 < matrices.get(m1).size(); m2++)
				for (int m3 = 0; m3 < matrices.get(m1).get(m2).size(); m3++)
					temp[m2][m3] = matrices.get(m1).get(m2).get(m3);
			if (m1 == 0)
				matr[0] = temp;
			else if (m1 == 1)
				matr[1] = temp;
		}
		int[][] product = mm(matr[0], matr[1]);
		pm(product);
		out.printf("\nTook %dms", (System.currentTimeMillis() - millis));
		scan.close();
	}
	
	public static int[][] mm(int[][] a, int[][] b)
	{
		int[][] ret = new int[a.length][b[0].length];
		for (int row = 0; row < a.length; row++)
			for (int col = 0; col < b[0].length; col++)
				for (int col2 = 0; col2 < a[0].length; col2++)
					ret[row][col] += a[row][col2] * b[col2][col];
		return ret;
	}
	
	private static void pm(int[][] matrix)
	{
		for (int[] dd : matrix)
		{
			for (int d : dd)
				out.printf("%d\t", d);
			out.println();
		}
	}
}