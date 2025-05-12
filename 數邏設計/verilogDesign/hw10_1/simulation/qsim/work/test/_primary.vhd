library verilog;
use verilog.vl_types.all;
entity test is
    port(
        A               : in     vl_logic_vector(7 downto 0);
        B               : in     vl_logic_vector(7 downto 0);
        C               : in     vl_logic_vector(7 downto 0);
        Large           : out    vl_logic_vector(7 downto 0);
        Middle          : out    vl_logic_vector(7 downto 0);
        Small           : out    vl_logic_vector(7 downto 0)
    );
end test;
