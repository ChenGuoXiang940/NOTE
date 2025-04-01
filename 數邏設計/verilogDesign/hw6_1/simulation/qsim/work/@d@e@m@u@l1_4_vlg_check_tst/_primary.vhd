library verilog;
use verilog.vl_types.all;
entity DEMUL1_4_vlg_check_tst is
    port(
        S               : in     vl_logic_vector(1 downto 0);
        Y               : in     vl_logic_vector(3 downto 0);
        sampler_rx      : in     vl_logic
    );
end DEMUL1_4_vlg_check_tst;
