library verilog;
use verilog.vl_types.all;
entity test is
    port(
        A               : in     vl_logic_vector(2 downto 0);
        B               : in     vl_logic_vector(2 downto 0);
        C               : in     vl_logic_vector(2 downto 0);
        F               : out    vl_logic
    );
end test;
