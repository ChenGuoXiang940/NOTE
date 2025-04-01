library verilog;
use verilog.vl_types.all;
entity DEMUL1_4 is
    port(
        DIN             : in     vl_logic;
        S               : out    vl_logic_vector(1 downto 0);
        Y               : out    vl_logic_vector(3 downto 0)
    );
end DEMUL1_4;
