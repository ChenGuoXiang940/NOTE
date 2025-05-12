library verilog;
use verilog.vl_types.all;
entity test is
    port(
        c0              : in     vl_logic;
        x               : in     vl_logic_vector(3 downto 0);
        y               : in     vl_logic_vector(3 downto 0);
        c4              : out    vl_logic;
        s               : out    vl_logic_vector(3 downto 0)
    );
end test;
