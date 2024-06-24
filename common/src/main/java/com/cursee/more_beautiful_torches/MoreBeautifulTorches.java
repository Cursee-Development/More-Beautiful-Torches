package com.cursee.more_beautiful_torches;

import com.cursee.monolib.platform.Services;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class MoreBeautifulTorches {

    public static final String CONFIG_FILEPATH = Services.PLATFORM.getGameDirectory() + File.separator + "config";
    public static final String MBT_TESTPATH = CONFIG_FILEPATH + File.separator + "test.txt";
    public static final String MBT_TEST1PATH = CONFIG_FILEPATH + File.separator + "test1.txt";

    public static void init() {

        File CONFIG_FILE = new File(CONFIG_FILEPATH);
        if (!CONFIG_FILE.isDirectory()) {
            CONFIG_FILE.mkdir();
        }

        File MBT_TEST = new File(MBT_TESTPATH);
        File MBT_TEST1 = new File(MBT_TEST1PATH);

        if (MBT_TEST.isFile()) {

            List<String> received = new ArrayList<>();

            try {
                BufferedReader reader = new BufferedReader(new FileReader(MBT_TEST));

                Stream<String> lines = reader.lines();

                Iterator<String> it = lines.iterator();

                while (it.hasNext()) {
                    String line = it.next();
                    System.out.println(line);
                    received.add(line);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            Iterator<String> receivedIterator = received.iterator();

            try {

                BufferedWriter writer = new BufferedWriter(new FileWriter(MBT_TEST1));

                writer.write("{" + '\n');

                while (receivedIterator.hasNext()) {
                    writer.write("    \"" + receivedIterator.next() + "\",\n");
                }

                writer.write("}");

                writer.flush();
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }




    // contain within init
//
//    public static final List<String> blockNames = new ArrayList<String>();
//
////        CreativeModeTabs.allTabs().forEach(tab -> {
////            // Building Blocks
////            // Colored Blocks
////            // Natural Blocks
////            // Functional Blocks
////            // Redstone Blocks
////
////            final String tabTitle = tab.getDisplayName().getString();
////
////            System.out.println(tabTitle);
////
////            if (tabTitle.contains("Building Blocks") || tabTitle.contains("Colored Blocks") || tabTitle.contains("Natural Blocks") || tabTitle.contains("Functional Blocks") || tabTitle.contains("Redstone Blocks")) {
////                tab.getDisplayItems().forEach(stack -> {
////                    final String name = stack.getDescriptionId().replace("block.minecraft.", "");
////                    blockNames.add(name);
////
////                    System.out.println(name);
////                });
////            }
////        });
//
//        BuiltInRegistries.BLOCK.forEach(block -> {
//            final String name = block.getDescriptionId().replace("block.minecraft.", "");
//            blockNames.add(name);
//            System.out.println("added " + name);
//        });
//
//        for (String name : blockNames) {
//            System.out.println("found: " + name);
//        }
//
//        Collections.sort(blockNames);
//        System.out.println("sorted?");
//
//        for (String name : blockNames) {
//            System.out.println("found: " + name);
//        }
//
//        File CONFIG_DIR = new File(Services.PLATFORM.getGameDirectory() + File.separator + "config");
//
//        if (!CONFIG_DIR.isDirectory()) {
//            CONFIG_DIR.mkdir();
//        }
//
//        try {
//            File file = new File(Services.PLATFORM.getGameDirectory() + File.separator + "config" + File.separator + "test.txt");
//            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
//            for (String name : blockNames) {
//
//                /*
//                 *
//                 * exclude weird names
//                 *
//                 *
//                 */
//
//                boolean flagged;
//
//                final boolean air = name.contains("air");
//                final boolean sapling = name.contains("sapling") || name.contains("propagule");
//                final boolean bedrock = name.contains("bedrock");
//                final boolean liquid = name.contains("water") || name.contains("lava");
//                final boolean roots = name.contains("roots");
//                final boolean leaves = name.contains("leaves");
//                final boolean dispenser = name.contains("dispenser");
//                final boolean door = name.contains("door");
//                final boolean button = name.contains("button");
//                final boolean fence = name.contains("fence");
//                final boolean sign = name.contains("sign");
//                final boolean slab = name.contains("slab");
//                final boolean rail = name.contains("rail");
//                final boolean stem = name.contains("stem");
//                final boolean wall = name.contains("wall");
//                final boolean anvil = name.contains("anvil");
//                final boolean barrier = name.contains("barrier");
//                final boolean dripleaf = name.contains("dripleaf");
//                final boolean candle = name.contains("candle");
//                final boolean bed = name.contains("bed");
//                final boolean cake = name.contains("cake");
//                final boolean carpet = name.contains("carpet");
//                final boolean banner = name.contains("banner");
//                final boolean shulker = name.contains("shulker");
//                final boolean furnace = name.contains("furnace");
//                final boolean table = name.contains("table");
//                final boolean flower = name.contains("flower");
//                final boolean chorus = name.contains("chorus");
//                final boolean comparator = name.contains("comparator");
//                final boolean composter = name.contains("composter");
//                final boolean conduit = name.contains("conduit");
//                final boolean bulb = name.contains("bulb");
//                final boolean craft = name.contains("craft");
//                final boolean head = name.contains("head");
//                final boolean fire = name.equals("fire");
//                final boolean lichen = name.contains("lichen");
//                final boolean grindstone = name.contains("grindstone");
//                final boolean hopper = name.contains("hopper");
//                final boolean bars = name.contains("bars");
//                final boolean pressure = name.contains("pressure");
//                final boolean cluster = name.contains("cluster");
//                final boolean allium = name.contains("allium");
//                final boolean azalea = name.contains("azalea");
//                final boolean azure = name.contains("azure");
//                final boolean beacon = name.contains("beacon");
//                final boolean bell = name.contains("bell");
//                final boolean orchid = name.contains("orchid");
//                final boolean stand = name.contains("stand");
//                final boolean cactus = name.contains("cactus");
//                final boolean bud = name.contains("bud");
//                final boolean cobweb = name.contains("cobweb");
//                final boolean cocoa = name.contains("cocoa");
//                final boolean chest = name.contains("chest");
//                final boolean command = name.contains("command");
//                final boolean lever = name.contains("lever");
//                final boolean light = name.contains("light");
//                final boolean skull = name.contains("skull");
//                final boolean rose = name.contains("rose");
//                final boolean tulip = name.contains("tulip");
//                final boolean wheat = name.contains("wheat");
//                final boolean vine = name.contains("vine");
//                final boolean vault = name.contains("vault");
//                final boolean egg = name.contains("egg");
//                final boolean spawner = name.contains("spawner");
//                final boolean wire = name.contains("wire");
//                final boolean torch = name.contains("torch");
//                final boolean sugar_cane = name.equalsIgnoreCase("sugar_cane");
//                final boolean campfire = name.contains("campfire");
//                final boolean infested = name.contains("infested");
//                final boolean grass = name.contains("grass");
//                final boolean bush = name.contains("bush");
//
//                final boolean NAMED = name.contains("NAMED");
//
//
//
//                flagged = !air && !sapling && !bedrock && !liquid && !roots && !leaves && !dispenser &&
//                !door && !button && !fence && !sign && !slab && !rail && !stem && !wall &&
//                !anvil && !barrier && !dripleaf && !candle && !bed && !cake && !carpet && !banner &&
//                !shulker && !furnace && !table && !flower && !chorus && !comparator && !composter && !conduit &&
//                !bulb && !craft && !head && !fire && !lichen && !grindstone && !hopper && !bars &&
//                !pressure && !cluster && !allium && !azalea && !azure && !beacon && !bell && !orchid &&
//                !stand && !cactus && !bud && !cobweb && !cocoa && !chest && !command && !lever &&
//                !light && !skull && !rose && !tulip && !wheat && !vine && !vault && !egg &&
//                !spawner && !wire && !torch && !sugar_cane && !campfire && !infested && !grass && !bush;
//
//                if (flagged) {
//                    System.out.println("wrote: " + name);
//                    writer.write(name + '\n');
//                } else {
//                    System.out.println("failed check??");
//                }
//            }
//            writer.flush();
//            writer.close();
//
//        } catch (IOException exception) {
//            System.out.println(exception.getMessage());
//        }
}