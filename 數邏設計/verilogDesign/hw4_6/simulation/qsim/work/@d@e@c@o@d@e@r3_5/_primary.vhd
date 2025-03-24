library verilog;
use verilog.vl_types.all;
entity DECODER3_5 is
    port(
        A               : in     vl_logic;
        B               : in     vl_logic;
        C               : in     vl_logic;
        Y               : out    vl_logic_vector(4 downto 0)
    );
end DECODER3_5;
