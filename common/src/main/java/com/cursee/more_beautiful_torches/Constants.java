package com.cursee.more_beautiful_torches;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oshi.util.tuples.Pair;
import oshi.util.tuples.Triplet;

public class Constants {

	public static final String MOD_ID = "more_beautiful_torches";
	public static final String MOD_NAME = "More Beautiful TOrches";
	public static final String MOD_VERSION = "3.0.1";
	public static final String MC_VERSION_RAW = "[1.20.6]";
	public static final Pair<String, String> PUBLISHER_AUTHOR = new Pair<String, String>("Lupin", "Jason13");
	public static final Triplet<String, String, String> PRIMARY_CURSEFORGE_MODRINTH = new Triplet<String, String, String>("https://www.curseforge.com/members/lupin/projects", "https://www.curseforge.com/members/lupin/projects", "https://modrinth.com/user/Lupin/mods");
	public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);
}
