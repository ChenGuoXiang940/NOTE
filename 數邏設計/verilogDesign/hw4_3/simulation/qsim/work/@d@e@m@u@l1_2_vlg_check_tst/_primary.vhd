library verilog;
use verilog.vl_types.all;
entity DEMUL1_2_vlg_check_tst is
    port(
        Y               : in     vl_logic_vector(1 downto 0);
        sampler_rx      : in     vl_logic
    );
end DEMUL1_2_vlg_check_tst;
