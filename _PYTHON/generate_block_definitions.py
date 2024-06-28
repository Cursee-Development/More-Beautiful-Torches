base = """    public static final Block UPPERCASE_REDSTONE_TORCH = registerBlock("lowercase_redstone_torch", new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)) );
    public static final Block UPPERCASE_REDSTONE_WALL_TORCH = registerBlock("lowercase_redstone_wall_torch", new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH).dropsLike(UPPERCASE_REDSTONE_TORCH)) );
    public static final Block UPPERCASE_SOUL_TORCH = registerBlock("lowercase_soul_torch", new TorchBlock( ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)) );
    public static final Block UPPERCASE_SOUL_WALL_TORCH = registerBlock("lowercase_soul_wall_torch", new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH).dropsLike(UPPERCASE_SOUL_TORCH)) );
    public static final Block UPPERCASE_TORCH = registerBlock("lowercase_torch", new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)) );
    public static final Block UPPERCASE_WALL_TORCH = registerBlock("lowercase_wall_torch", new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).dropsLike(UPPERCASE_TORCH)) );"""

with open('test.txt', 'r') as infile, open('new_test.txt', 'w') as outfile:
    for line in infile:
        outfile.write(base.replace("UPPERCASE", line.rstrip('\n')).replace("lowercase", line.rstrip('\n').lower()) + '\n')

