library verilog;
use verilog.vl_types.all;
entity RELATIONAL is
    port(
        A               : in     vl_logic_vector(3 downto 0);
        B               : in     vl_logic_vector(3 downto 0);
        LARGE           : out    vl_logic;
        SMALL           : out    vl_logic;
        LARGE_EQV       : out    vl_logic;
        SMALL_EQV       : out    vl_logic
    );
end RELATIONAL;
