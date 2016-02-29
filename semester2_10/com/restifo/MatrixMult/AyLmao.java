package com.restifo.MatrixMult;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
@SuppressWarnings("unused")
public class AyLmao {
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		String what = "import java.io.BufferedReader; import java.io.File; import java.io.IOException; import java.io.InputStreamReader; import java.net.MalformedURLException; import java.net.URL; import java.security.MessageDigest; import java.security.NoSuchAlgorithmException; import java.util.ArrayList; import java.util.Arrays; import java.util.Base64; import java.util.HashMap; import java.util.LinkedHashMap; import java.util.Map; import java.util.Scanner;"+
			"public class TesterMatrices {"+
			"protected transient volatile static int lmao = 0;"+
			"public static void main(String[] args) throws NoSuchAlgorithmException, MalformedURLException, IOException"+
			"{"+
				"long millis = System.currentTimeMillis();"+
				"MessageDigest rekt = MessageDigest.getInstance(new String(new char[] {((' ') << 1) + 0xD, '<' + 0x8, '*' + 0xB}));"+		
				"Scanner scan = new Scanner(new File(new String(Base64.getDecoder().decode(\"cmVzb3VyY2VzL01hdHJpeE11bHQvTWF0cml4RGF0YS50eHQ=\"))));"+
				"ArrayList<ArrayList<ArrayList<Integer>>> matrices = new ArrayList<ArrayList<ArrayList<Integer>>>();"+
				"String[] lmao = new BufferedReader(new InputStreamReader(new URL(new String(Base64.getDecoder().decode(\"aHR0cDovL3Jlc3RpZm8uY28vaXRzbGl0LnR4dA==\"))).openConnection().getInputStream())).readLine().split(\":\");"+
				"LinkedHashMap<Integer, Integer> what = new LinkedHashMap<Integer, Integer>(){{ put(0x69, 0x0);put(0x5d, 0x0);put(0x70, 0x0);put(0x6e, 0x0);put(0x65, 0x0);put(0x74, 0x0); }};"+
				"final String kek = new String(Arrays.toString(Arrays.copyOf(new ArrayList<Integer>(){{"+
					"for (Integer k : what.keySet())"+
						"add(k ^ what.get(k));"+
				"}}.stream().mapToInt(x -> x).mapToObj(x -> (char)x).toArray(), (0x55 ^ 0x53), Character[].class)).replace(lmao[3], \"\").replace(lmao[4], \"\").substring(1, 7).toCharArray());"+
				"int m = -1, r = -1;"+
				"Map<String, Character> check = new HashMap<String, Character>(){{"+
					" char[] res = {(char)Integer.parseInt(new String(Base64.getDecoder().decode(\"OTk=\"))), (char)Integer.parseInt(new String(Base64.getDecoder().decode(\"OTY=\"))), (char)Integer.parseInt(new String(Base64.getDecoder().decode(\"MTA0\")))};"+
					 "for (int i = 0; i < res.length; i++)"+
					 "{"+
						" final int savage = i;"+
						 "put(new String(Arrays.toString(new ArrayList<String>(){{"+
							" StringBuilder sb = new StringBuilder(new ArrayList<Integer>(){{"+
							"	 for (int i = 0; i < (32 << 3); i++) add(1);"+
							 "}}.stream().mapToInt(x -> x).reduce(0, Integer::sum));"+
							 "byte[] hip = rekt.digest(new String(new char[] {(char)(res[savage] + 0xF)}).getBytes(new StringBuilder(\"8-FTU\").reverse().toString()));"+
							 "for (byte b : hip)"+
								" sb.append(String.format(lmao[0], b & 0xFF));"+
							 "add(sb.toString());"+
						 "}}.toArray()).replace(lmao[2], \"\").replace(lmao[1], \"\")), new Character((char)(res[i] + 0xF)));"+
					 "}"+
				"}};"+
				"while (scan.hasNextLine())"+
				"{"+
				"	String line = scan.nextLine();"+
				"	if (line.equals(Arrays.toString(new ArrayList<Character>(){{"+
				"		char[] op = kek.toCharArray();"+
				"		for (int i = 0; i < op.length; i++)"+
				"			add((char)(op[i] + (0xF5 & 0x4)));"+
				"	}}.toArray()).replace(lmao[3], \"\").replace(lmao[4], \"\").replace(lmao[2], \"\").replace(lmao[1], \"\")))"+
				"	{"+
				"		matrices.add(new ArrayList<ArrayList<Integer>>());"+
				"		m++;"+
				"		r = -1;"+
				"	}"+
				"	else if (line.equals(new String(new char[] {(char)(check.get(\"4b43b0aee35624cd95b910189b3dc231\")), (char)(check.get(\"d95679752134a2d9eb61dbd7b91c4bcc\")), (char)(check.get(\"f1290186a5d0b1ceab27f4e77c0c5d68\"))})))"+
				"	{"+
				"		matrices.get(m).add(new ArrayList<Integer>());"+
				"		r++;"+
				"	}"+
				"	else"+
				"		matrices.get(m).get(r).add(Integer.parseInt(line));"+
				"}"+
				"int[][][] matr = {new int[matrices.get(0).size()][matrices.get(0).get(0).size()],"+
				"			      new int[matrices.get(1).size()][matrices.get(1).get(0).size()]};"+
				"for (int m1 = 0; m1 < matrices.size(); m1++)"+
				"{"+
				"	int[][] temp = m1 == 0 ? matr[0] : matr[1];"+
				"	for (int m2 = 0; m2 < matrices.get(m1).size(); m2++)"+
				"		for (int m3 = 0; m3 < matrices.get(m1).get(m2).size(); m3++)"+
				"			temp[m2][m3] = matrices.get(m1).get(m2).get(m3);"+
				"	if (m1 == 0)"+
				"		matr[0] = temp;"+
				"	else if (m1 == 1)"+
				"		matr[1] = temp;"+
				"}"+
				"int[][] product = mm(matr[0], matr[1]);"+
				"pm(product);"+
				"out.printf(\"\nTook %dms\", (System.currentTimeMillis() - millis));"+
				"scan.close();"+
			"}"+
			"public static int[][] mm(int[][] a, int[][] b)"+
			"{"+
				"int[][] ret = new int[a.length][b[0].length];"+
				"for (int row = 0; row < a.length; row++)"+
					"for (int col = 0; col < b[0].length; col++)"+
						"for (int col2 = 0; col2 < a[0].length; col2++)"+
							"ret[row][col] += a[row][col2] * b[col2][col];"+
				"return ret;"+
			"}"+
			"private static void pm(int[][] matrix)"+
			"{"+
				"for (int[] dd : matrix)"+
				"{"+
					"for (int d : dd)"+
						"out.printf(\"%d\t\", d);"+
					"out.println();"+
				"}"+
			"}"+
		"}";
		System.setProperty("java.home", "C:\\Program Files\\Java\\jdk1.8.0_45");
		URL location = AyLmao.class.getProtectionDomain().getCodeSource().getLocation();
		System.out.println(location.getFile());
		File root = new File("H:\\AP programming 2\\APProgramming\\bin\\test"); 
		File src = new File(root, "TesterMatrices.java");
		System.out.println(src.toURI().toURL());
		Writer writer = new FileWriter(src);
		writer.write(what);
		writer.close();
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		compiler.run(null, null, null, src.getPath());
		URLClassLoader loader = URLClassLoader.newInstance(new URL[] { root.toURI().toURL() });
		Class<?> cls = Class.forName("TesterMatrices", true, loader);
	}
}
