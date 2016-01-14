package com.restifo.Semester1Exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
@SuppressWarnings("serial")
public class ProductManager {
	Map<String, Double> stateTax = new HashMap<String, Double>();
	private LinkedHashMap<Integer, ProductDetails> allProducts = new LinkedHashMap<Integer, ProductDetails>() 
	{{
		put(5040, new ProductDetails("Gleaming Half Mask", "Every party is more fun when guests are in disguise! Hand out these plastic metallic half masquerade masks to party guests. They’re a masquerade costume all by themselves! Includes elastic band. (2 dozen per unit) 6 3/4", 24, 4.95));
		put(12640, new ProductDetails("Mega Metallic Bead Necklace Assortment", "Mega Metallic Bead Necklace Assortment are perfect for a child's party. Bead necklaces are fun accessories and can be easily thrown from parade floats! In a rainbow of dazzling colors, this vivid jewelry is the perfect favor for a birthday bash or other colorful celebration. Fun for Mardi Gras, too! (144 pcs. per unit) 33\" Assortment may vary.", 144, 21.0));
		put(262, new ProductDetails("Adult King’s Crown", "Adult King’s Crown. Trimmed with faux ermine and gold lamé, this plush red velvet crown really rules! 12\"", 1, 6.0));
		put(763, new ProductDetails("Mardi Gras Feather Mask Assortment", "It's not an official Louisiana Mardi Gras without this Mardi Gras Feather Mask Assortment! Perfect for any Mardi Gras themed party or event, these masquerade masks are a must-have to pass out to your guests. Each Mardi Gras feather mask will create the perfect mysterious disguise at the masquerade ball, costume party or parade. Just be sure to order enough masquerade masks for everyone! Each with an elastic band. 6 1/2\" - 8 1/2\" Assortment may vary.", 12, 15.0));
		put(2199, new ProductDetails("Glitter Voodoo & Skull Tattoos", "Stick these on for a colorful Mardi Gras accent. Easy to apply and remove. Safe and non-toxic. (6 dozen per unit) 1 1/2\" © OTC", 72, 2.49));
		put(865, new ProductDetails("Golden Crown Jewel Tiara", "Golden Crown Jewel Tiara. Embellished with faux rubies, this elegant plastic tiara is a gem! One size fits most. Height - 4 3/4\".", 1, 3.5));
		put(5300, new ProductDetails("Mardi Gras Crown Beads", "Mardi Gras Crown Beads. Metallic purple, gold and green 32\" strands with plastic beads and a 2\" plastic crown charm. (2 dozen per unit)", 24, 8.50));
		put(117, new ProductDetails("Colorful Mardi Gras Coins", "Colorful Mardi Gras Coins. These coins come in Mardi Gras colors! Scatter this gold, green and purple money on tables at your Mardi Gras party for a unique Louisiana-inspired confetti. You can also toss these festive coins from parade floats! (144 pcs. per unit) 1 1/4\" © OTC", 144, 5.0));
		put(86, new ProductDetails("Mardi Gras Mylar Balloons", "Mardi Gras Mylar Balloons. Add some wild color to your Mardi Gras celebration! Featuring a festive jester in green, gold and purple, these balloons make excellent party favors! 18\" © OTC", 12, 16.0));
		put(362, new ProductDetails("Jester Hat Mylar Balloon", "Jester Hat Mylar Balloon. Take you Mardi Gras decorations to the next level! This Jester Hat Mylar Balloon is just what you need to add color and intrest and complete your Mardi Gras decor. Vibrant colors and eye-catching patterns! Add it to your Mardi Gras decorations! 24\" © OTC", 1, 4.99));
	}};
	public ProductManager()
	{
		initMap();
	}
	
	public ProductDetails getProduct(int itemCode) { return allProducts.get(itemCode); }
	public int[] getAllProducts()
	{
		return allProducts.keySet().stream().mapToInt(x -> x).toArray();
	}
	private void initMap()
	{
		Scanner in = null;
		try
		{
			in = new Scanner(new File("resources/Semester1Exam/tax_states.txt"));
			while (in.hasNextLine())
			{
				String[] line = in.nextLine().split(" ");
				stateTax.put(line[0], Double.parseDouble(line[1]));
			}
		}
		catch (FileNotFoundException ex) { ex.printStackTrace(); }
		finally
		{
			in.close();
		}
	}
}
